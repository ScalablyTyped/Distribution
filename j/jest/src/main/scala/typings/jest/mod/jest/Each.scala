package typings.jest.mod.jest

import typings.std.TemplateStringsArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Each extends StObject {
  
  def apply(cases: js.Array[js.Array[_]]): js.Function3[
    /* name */ String, 
    /* fn */ js.Function1[/* repeated */ js.Any, _], 
    /* timeout */ js.UndefOr[Double], 
    Unit
  ] = js.native
  def apply(strings: TemplateStringsArray, placeholders: js.Any*): js.Function3[
    /* name */ String, 
    /* fn */ js.Function1[/* arg */ js.Any, _], 
    /* timeout */ js.UndefOr[Double], 
    Unit
  ] = js.native
}
