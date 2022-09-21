package typings.knockoutPostbox

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KnockoutObservableArray[T] extends StObject {
  
  def publishOn(topic: String): KnockoutObservableArray[T] = js.native
  def publishOn(topic: String, skipInitialPublish: Boolean): KnockoutObservableArray[T] = js.native
  def publishOn(
    topic: String,
    skipInitialPublish: Boolean,
    equalityComparer: js.Function2[/* newValue */ Any, /* oldValue */ Any, Boolean]
  ): KnockoutObservableArray[T] = js.native
  def publishOn(
    topic: String,
    skipInitialPublish: Unit,
    equalityComparer: js.Function2[/* newValue */ Any, /* oldValue */ Any, Boolean]
  ): KnockoutObservableArray[T] = js.native
  
  def stopPublishingOn(topic: String): KnockoutObservableArray[T] = js.native
  
  def subscribeTo(topic: String): KnockoutObservableArray[T] = js.native
  def subscribeTo(topic: String, useLastPublishedValueToInitialize: Boolean): KnockoutObservableArray[T] = js.native
  def subscribeTo(
    topic: String,
    useLastPublishedValueToInitialize: Boolean,
    transform: js.Function1[/* val */ Any, Any]
  ): KnockoutObservableArray[T] = js.native
  def subscribeTo(
    topic: String,
    useLastPublishedValueToInitialize: Unit,
    transform: js.Function1[/* val */ Any, Any]
  ): KnockoutObservableArray[T] = js.native
  
  def syncWith(topic: String): KnockoutObservableArray[T] = js.native
  def syncWith(topic: String, initializeWithLatestValue: Boolean): KnockoutObservableArray[T] = js.native
  def syncWith(topic: String, initializeWithLatestValue: Boolean, skipInitialPublish: Boolean): KnockoutObservableArray[T] = js.native
  def syncWith(
    topic: String,
    initializeWithLatestValue: Boolean,
    skipInitialPublish: Boolean,
    equalityComparer: js.Function2[/* newValue */ Any, /* oldValue */ Any, Boolean]
  ): KnockoutObservableArray[T] = js.native
  def syncWith(
    topic: String,
    initializeWithLatestValue: Boolean,
    skipInitialPublish: Unit,
    equalityComparer: js.Function2[/* newValue */ Any, /* oldValue */ Any, Boolean]
  ): KnockoutObservableArray[T] = js.native
  def syncWith(topic: String, initializeWithLatestValue: Unit, skipInitialPublish: Boolean): KnockoutObservableArray[T] = js.native
  def syncWith(
    topic: String,
    initializeWithLatestValue: Unit,
    skipInitialPublish: Boolean,
    equalityComparer: js.Function2[/* newValue */ Any, /* oldValue */ Any, Boolean]
  ): KnockoutObservableArray[T] = js.native
  def syncWith(
    topic: String,
    initializeWithLatestValue: Unit,
    skipInitialPublish: Unit,
    equalityComparer: js.Function2[/* newValue */ Any, /* oldValue */ Any, Boolean]
  ): KnockoutObservableArray[T] = js.native
  
  def unsubscribeFrom(topic: String): KnockoutObservableArray[T] = js.native
}
