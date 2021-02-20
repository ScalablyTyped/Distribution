package typings.ipcheck

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Shortcut
import typings.ipcheck.ipcheckNumbers.`0`
import typings.ipcheck.ipcheckNumbers.`4`
import typings.ipcheck.ipcheckNumbers.`6`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("ipcheck", JSImport.Namespace)
  @js.native
  class ^ protected () extends IPCheck {
    def this(input: String) = this()
  }
  @JSImport("ipcheck", JSImport.Namespace)
  @js.native
  val ^ : IPCheckStatic = js.native
  
  @js.native
  trait IPCheck extends StObject {
    
    var address: js.Array[Double] = js.native
    
    var input: String = js.native
    
    var ipv: `4` | `6` | `0` = js.native
    
    var mask: Double = js.native
    
    def `match`(cidr: String): Boolean = js.native
    def `match`(cidr: IPCheck): Boolean = js.native
    
    var valid: Boolean = js.native
  }
  
  @js.native
  trait IPCheckConstructor extends Instantiable1[/* input */ String, IPCheck]
  
  @js.native
  trait IPCheckStatic extends IPCheckConstructor {
    
    def `match`(ip: String, cidr: String): Boolean = js.native
    def `match`(ip: String, cidr: IPCheck): Boolean = js.native
    def `match`(ip: IPCheck, cidr: String): Boolean = js.native
    def `match`(ip: IPCheck, cidr: IPCheck): Boolean = js.native
  }
  
  type _To = IPCheckStatic
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: IPCheckStatic = ^
}
