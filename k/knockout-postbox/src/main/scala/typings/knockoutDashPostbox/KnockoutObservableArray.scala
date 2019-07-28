package typings.knockoutDashPostbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KnockoutObservableArray[T] extends js.Object {
  def publishOn(topic: String): KnockoutObservableArray[T] = js.native
  def publishOn(topic: String, skipInitialPublish: Boolean): KnockoutObservableArray[T] = js.native
  def publishOn(
    topic: String,
    skipInitialPublish: Boolean,
    equalityComparer: js.Function2[/* newValue */ js.Any, /* oldValue */ js.Any, Boolean]
  ): KnockoutObservableArray[T] = js.native
  def stopPublishingOn(topic: String): KnockoutObservableArray[T] = js.native
  def subscribeTo(topic: String): KnockoutObservableArray[T] = js.native
  def subscribeTo(topic: String, useLastPublishedValueToInitialize: Boolean): KnockoutObservableArray[T] = js.native
  def subscribeTo(
    topic: String,
    useLastPublishedValueToInitialize: Boolean,
    transform: js.Function1[/* val */ js.Any, _]
  ): KnockoutObservableArray[T] = js.native
  def syncWith(topic: String): KnockoutObservableArray[T] = js.native
  def syncWith(topic: String, initializeWithLatestValue: Boolean): KnockoutObservableArray[T] = js.native
  def syncWith(topic: String, initializeWithLatestValue: Boolean, skipInitialPublish: Boolean): KnockoutObservableArray[T] = js.native
  def syncWith(
    topic: String,
    initializeWithLatestValue: Boolean,
    skipInitialPublish: Boolean,
    equalityComparer: js.Function2[/* newValue */ js.Any, /* oldValue */ js.Any, Boolean]
  ): KnockoutObservableArray[T] = js.native
  def unsubscribeFrom(topic: String): KnockoutObservableArray[T] = js.native
}

