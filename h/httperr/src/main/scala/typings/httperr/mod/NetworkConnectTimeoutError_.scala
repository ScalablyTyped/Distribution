package typings.httperr.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("httperr", "NetworkConnectTimeoutError")
@js.native
/**
  *  Creates an Error object. The new keyword is optional.
  * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
  *                                           If config is an Error object, it will be treated as config.cause.
  */
open class NetworkConnectTimeoutError_ ()
  extends StObject
     with HttpError {
  def this(config: String) = this()
  def this(config: js.Error) = this()
  def this(config: Config) = this()
  
  /* CompleteClass */
  var code: String = js.native
  
  /* standard es5 */
  /* CompleteClass */
  var message: String = js.native
  
  /* standard es5 */
  /* CompleteClass */
  var name: String = js.native
  
  /** The HTTP response status code for the HTTP error. */
  /* CompleteClass */
  var statusCode: Double = js.native
  
  /** A human-readable title for the HTTP error. */
  /* CompleteClass */
  var title: String = js.native
  
  /* CompleteClass */
  override def toObject(skip: (String | js.RegExp)*): Any = js.native
}
