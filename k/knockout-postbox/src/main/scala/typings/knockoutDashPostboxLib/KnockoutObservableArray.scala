package typings
package knockoutDashPostboxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KnockoutObservableArray[T] extends js.Object {
  def publishOn(topic: java.lang.String): KnockoutObservableArray[T] = js.native
  def publishOn(topic: java.lang.String, skipInitialPublish: scala.Boolean): KnockoutObservableArray[T] = js.native
  def publishOn(
    topic: java.lang.String,
    skipInitialPublish: scala.Boolean,
    equalityComparer: js.Function2[/* newValue */ js.Any, /* oldValue */ js.Any, scala.Boolean]
  ): KnockoutObservableArray[T] = js.native
  def stopPublishingOn(topic: java.lang.String): KnockoutObservableArray[T] = js.native
  def subscribeTo(topic: java.lang.String): KnockoutObservableArray[T] = js.native
  def subscribeTo(topic: java.lang.String, useLastPublishedValueToInitialize: scala.Boolean): KnockoutObservableArray[T] = js.native
  def subscribeTo(
    topic: java.lang.String,
    useLastPublishedValueToInitialize: scala.Boolean,
    transform: js.Function1[/* val */ js.Any, _]
  ): KnockoutObservableArray[T] = js.native
  def syncWith(topic: java.lang.String): KnockoutObservableArray[T] = js.native
  def syncWith(topic: java.lang.String, initializeWithLatestValue: scala.Boolean): KnockoutObservableArray[T] = js.native
  def syncWith(
    topic: java.lang.String,
    initializeWithLatestValue: scala.Boolean,
    skipInitialPublish: scala.Boolean
  ): KnockoutObservableArray[T] = js.native
  def syncWith(
    topic: java.lang.String,
    initializeWithLatestValue: scala.Boolean,
    skipInitialPublish: scala.Boolean,
    equalityComparer: js.Function2[/* newValue */ js.Any, /* oldValue */ js.Any, scala.Boolean]
  ): KnockoutObservableArray[T] = js.native
  def unsubscribeFrom(topic: java.lang.String): KnockoutObservableArray[T] = js.native
}

