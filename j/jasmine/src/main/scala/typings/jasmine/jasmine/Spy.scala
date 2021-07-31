package typings.jasmine.jasmine

import typings.std.Parameters
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Spy[Fn /* <: Func */] extends StObject {
  
  def apply(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param params because its type Parameters<Fn> is not an array type */ params: Parameters[Fn]
  ): ReturnType[Fn] = js.native
  
  var and: SpyAnd[Fn] = js.native
  
  var calls: Calls[Fn] = js.native
  
  def withArgs(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type MatchableArgs<Fn> is not an array type */ args: MatchableArgs[Fn]
  ): Spy[Fn] = js.native
}
