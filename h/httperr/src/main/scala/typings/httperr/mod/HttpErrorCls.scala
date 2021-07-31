package typings.httperr.mod

import typings.std.Error
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The base type for all httperr error types. You probably don't want to use this directly. */
/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSImport("httperr", "HttpError")
@js.native
class HttpErrorCls ()
  extends StObject
     with HttpError {
  def this(config: String) = this()
  def this(config: Config) = this()
  def this(config: Error) = this()
  def this(config: String, extra: js.Object) = this()
  def this(config: Unit, extra: js.Object) = this()
  def this(config: Config, extra: js.Object) = this()
  def this(config: Error, extra: js.Object) = this()
  
  /* CompleteClass */
  var code: String = js.native
  
  /* CompleteClass */
  var message: String = js.native
  
  /* CompleteClass */
  var name: String = js.native
  
  /** The HTTP response status code for the HTTP error. */
  /* CompleteClass */
  var statusCode: Double = js.native
  
  /** A human-readable title for the HTTP error. */
  /* CompleteClass */
  var title: String = js.native
  
  /* CompleteClass */
  override def toObject(skip: (String | RegExp)*): js.Any = js.native
}
