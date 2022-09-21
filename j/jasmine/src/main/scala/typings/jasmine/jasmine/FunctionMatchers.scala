package typings.jasmine.jasmine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FunctionMatchers[Fn /* <: Func */]
  extends StObject
     with Matchers[scala.Any] {
  
  /**
    * Invert the matcher following this expect.
    */
  @JSName("not")
  var not_FunctionMatchers: FunctionMatchers[Fn] = js.native
  
  /**
    * Expects the actual (a spy) to have been called exactly once, and exactly with the particular arguments
    * @param params The arguments to look for
    */
  def toHaveBeenCalledOnceWith(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param params because its type MatchableArgs<Fn> is not an array type */ params: MatchableArgs[Fn]
  ): Unit = js.native
  
  /**
    * Expects the actual (a spy) to have been called with the particular arguments at least once
    * @param params The arguments to look for
    */
  def toHaveBeenCalledWith(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param params because its type MatchableArgs<Fn> is not an array type */ params: MatchableArgs[Fn]
  ): Unit = js.native
}
