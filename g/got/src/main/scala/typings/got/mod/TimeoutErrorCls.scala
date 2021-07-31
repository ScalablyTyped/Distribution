package typings.got.mod

import typings.got.gotStrings.connect
import typings.got.gotStrings.lookup
import typings.got.gotStrings.request
import typings.got.gotStrings.response
import typings.got.gotStrings.secureConnect
import typings.got.gotStrings.send
import typings.got.gotStrings.socket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSImport("got", "TimeoutError")
@js.native
class TimeoutErrorCls ()
  extends StObject
     with TimeoutError {
  
  /* CompleteClass */
  var event: lookup | connect | secureConnect | socket | response | send | request = js.native
  
  /* CompleteClass */
  var message: String = js.native
  
  /* CompleteClass */
  var name: String = js.native
  /* CompleteClass */
  @JSName("name")
  var name_TimeoutError: typings.got.gotStrings.TimeoutError = js.native
}
