package typings
package knockoutDashPostboxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KnockoutObservable[T] extends js.Object {
  def publishOn(topic: java.lang.String): KnockoutObservable[T] = js.native
  def publishOn(topic: java.lang.String, skipInitialPublish: scala.Boolean): KnockoutObservable[T] = js.native
  def publishOn(
    topic: java.lang.String,
    skipInitialPublish: scala.Boolean,
    equalityComparer: js.Function2[/* newValue */ T, /* oldValue */ T, scala.Boolean]
  ): KnockoutObservable[T] = js.native
  def stopPublishingOn(topic: java.lang.String): KnockoutObservable[T] = js.native
  def subscribeTo(topic: java.lang.String): KnockoutObservable[T] = js.native
  def subscribeTo(topic: java.lang.String, useLastPublishedValueToInitialize: scala.Boolean): KnockoutObservable[T] = js.native
  def subscribeTo(
    topic: java.lang.String,
    useLastPublishedValueToInitialize: scala.Boolean,
    transform: js.Function1[/* val */ js.Any, T]
  ): KnockoutObservable[T] = js.native
  def syncWith(topic: java.lang.String): KnockoutObservable[T] = js.native
  def syncWith(topic: java.lang.String, initializeWithLatestValue: scala.Boolean): KnockoutObservable[T] = js.native
  def syncWith(
    topic: java.lang.String,
    initializeWithLatestValue: scala.Boolean,
    skipInitialPublish: scala.Boolean
  ): KnockoutObservable[T] = js.native
  def syncWith(
    topic: java.lang.String,
    initializeWithLatestValue: scala.Boolean,
    skipInitialPublish: scala.Boolean,
    equalityComparer: js.Function2[/* newValue */ T, /* oldValue */ T, scala.Boolean]
  ): KnockoutObservable[T] = js.native
  def unsubscribeFrom(topic: java.lang.String): KnockoutObservable[T] = js.native
}

