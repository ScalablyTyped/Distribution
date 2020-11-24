package typings.keygrip.mod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeygripFunction
  extends Instantiable1[/* keys */ js.Array[String], Keygrip]
     with Instantiable2[/* keys */ js.Array[String], /* algorithm */ String, Keygrip]
     with Instantiable3[
      /* keys */ js.Array[String], 
      js.UndefOr[/* algorithm */ String], 
      /* encoding */ String, 
      Keygrip
    ] {
  
  def apply(keys: js.Array[String]): Keygrip = js.native
  def apply(keys: js.Array[String], algorithm: js.UndefOr[scala.Nothing], encoding: String): Keygrip = js.native
  def apply(keys: js.Array[String], algorithm: String): Keygrip = js.native
  def apply(keys: js.Array[String], algorithm: String, encoding: String): Keygrip = js.native
}
