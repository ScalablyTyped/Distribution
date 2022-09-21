package typings.jridgewellSetArray

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@jridgewell/set-array", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@jridgewell/set-array", "SetArray")
  @js.native
  open class SetArray () extends StObject {
    
    /* private */ var _indexes: Any = js.native
    
    var array: js.Array[String] = js.native
  }
  
  @JSImport("@jridgewell/set-array", "get")
  @js.native
  def get: js.Function2[/* strarr */ SetArray, /* key */ String, js.UndefOr[Double]] = js.native
  inline def get_=(x: js.Function2[/* strarr */ SetArray, /* key */ String, js.UndefOr[Double]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("get")(x.asInstanceOf[js.Any])
  
  @JSImport("@jridgewell/set-array", "pop")
  @js.native
  def pop: js.Function1[/* strarr */ SetArray, Unit] = js.native
  inline def pop_=(x: js.Function1[/* strarr */ SetArray, Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pop")(x.asInstanceOf[js.Any])
  
  @JSImport("@jridgewell/set-array", "put")
  @js.native
  def put: js.Function2[/* strarr */ SetArray, /* key */ String, Double] = js.native
  inline def put_=(x: js.Function2[/* strarr */ SetArray, /* key */ String, Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("put")(x.asInstanceOf[js.Any])
}
