package typings.got.mod

import typings.node.Buffer
import typings.node.httpMod.IncomingHttpHeaders
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSImport("got", "HTTPError")
@js.native
class HTTPErrorCls ()
  extends StObject
     with HTTPError {
  
  /* CompleteClass */
  var body: Buffer | String | js.Object = js.native
  
  /* CompleteClass */
  var headers: IncomingHttpHeaders = js.native
  
  /* CompleteClass */
  var message: String = js.native
  
  /* CompleteClass */
  var name: String = js.native
  /* CompleteClass */
  @JSName("name")
  var name_HTTPError: typings.got.gotStrings.HTTPError = js.native
  
  /* CompleteClass */
  var statusCode: Double = js.native
  
  /* CompleteClass */
  var statusMessage: String = js.native
}
