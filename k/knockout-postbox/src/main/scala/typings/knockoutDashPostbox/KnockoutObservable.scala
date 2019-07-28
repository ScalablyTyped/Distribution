package typings.knockoutDashPostbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KnockoutObservable[T] extends js.Object {
  def publishOn(topic: String): KnockoutObservable[T] = js.native
  def publishOn(topic: String, skipInitialPublish: Boolean): KnockoutObservable[T] = js.native
  def publishOn(
    topic: String,
    skipInitialPublish: Boolean,
    equalityComparer: js.Function2[/* newValue */ T, /* oldValue */ T, Boolean]
  ): KnockoutObservable[T] = js.native
  def stopPublishingOn(topic: String): KnockoutObservable[T] = js.native
  def subscribeTo(topic: String): KnockoutObservable[T] = js.native
  def subscribeTo(topic: String, useLastPublishedValueToInitialize: Boolean): KnockoutObservable[T] = js.native
  def subscribeTo(
    topic: String,
    useLastPublishedValueToInitialize: Boolean,
    transform: js.Function1[/* val */ js.Any, T]
  ): KnockoutObservable[T] = js.native
  def syncWith(topic: String): KnockoutObservable[T] = js.native
  def syncWith(topic: String, initializeWithLatestValue: Boolean): KnockoutObservable[T] = js.native
  def syncWith(topic: String, initializeWithLatestValue: Boolean, skipInitialPublish: Boolean): KnockoutObservable[T] = js.native
  def syncWith(
    topic: String,
    initializeWithLatestValue: Boolean,
    skipInitialPublish: Boolean,
    equalityComparer: js.Function2[/* newValue */ T, /* oldValue */ T, Boolean]
  ): KnockoutObservable[T] = js.native
  def unsubscribeFrom(topic: String): KnockoutObservable[T] = js.native
}

