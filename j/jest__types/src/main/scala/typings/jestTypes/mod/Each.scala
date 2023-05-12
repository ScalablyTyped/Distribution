package typings.jestTypes.mod

import typings.std.Record
import typings.std.ReturnType
import typings.std.TemplateStringsArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Each[EachFn /* <: TestFn | BlockFn */] extends StObject {
  
  def apply[T](strings: TemplateStringsArray, expressions: (Any | T)*): js.Function3[
    /* name */ String | NameLike, 
    /* fn */ js.Function2[/* arg */ Record[String, T], /* done */ DoneFn2, ReturnType[EachFn]], 
    /* timeout */ js.UndefOr[Double], 
    Unit
  ] = js.native
  def apply[T /* <: Record[String, Any] */](table: js.Array[T]): js.Function3[
    /* name */ String | NameLike, 
    /* fn */ js.Function2[/* arg */ T, /* done */ DoneFn2, ReturnType[EachFn]], 
    /* timeout */ js.UndefOr[Double], 
    Unit
  ] = js.native
}
