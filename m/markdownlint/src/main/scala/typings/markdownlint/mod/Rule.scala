package typings.markdownlint.mod

import typings.std.URL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Rule definition.
  */
@js.native
trait Rule extends js.Object {
  
  /**
    * Rule description.
    */
  var description: String = js.native
  
  /**
    * Rule implementation.
    */
  def function(params: RuleParams, onError: RuleOnError): Unit = js.native
  /**
    * Rule implementation.
    */
  @JSName("function")
  var function_Original: RuleFunction = js.native
  
  /**
    * Link to more information.
    */
  var information: js.UndefOr[URL] = js.native
  
  /**
    * Rule name(s).
    */
  var names: js.Array[String] = js.native
  
  /**
    * Rule tag(s).
    */
  var tags: js.Array[String] = js.native
}
