package typings.jqueryAjaxfile

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type IAjaxFileResultCallback[T] = js.Function1[/* result */ IAjaxFileResult[T], Any]

/**
  * Interface for the JQuery promise/deferred callbacks
  */
type JQueryPromiseCallback[T] = js.Function2[/* value */ js.UndefOr[T], /* repeated */ Any, Unit]

type JQueryPromiseOperator[T, U] = js.Function2[
/* callback1 */ JQueryPromiseCallback[T] | js.Array[JQueryPromiseCallback[T]], 
/* repeated */ JQueryPromiseCallback[Any] | js.Array[JQueryPromiseCallback[Any]], 
JQueryPromise[U]]

type MochaDone = js.Function1[/* error */ js.UndefOr[js.Error], Unit]
