package typings.jasmine.jasmine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FunctionMatchers[Fn /* <: Func */]
  extends StObject
     with Matchers[js.Any] {
  
  /**
    * Invert the matcher following this expect.
    */
  @JSName("not")
  var not_FunctionMatchers: FunctionMatchers[Fn] = js.native
  
  def toHaveBeenCalledWith(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param params because its type MatchableArgs<Fn> is not an array type */ params: MatchableArgs[Fn]
  ): Boolean = js.native
}
