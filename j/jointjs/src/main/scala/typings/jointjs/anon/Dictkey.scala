package typings.jointjs.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dictkey
  extends StObject
     with /* key */ StringDictionary[js.Any] {
  
  var parentRelative: js.UndefOr[Boolean] = js.undefined
}
object Dictkey {
  
  inline def apply(): Dictkey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Dictkey]
  }
  
  extension [Self <: Dictkey](x: Self) {
    
    inline def setParentRelative(value: Boolean): Self = StObject.set(x, "parentRelative", value.asInstanceOf[js.Any])
    
    inline def setParentRelativeUndefined: Self = StObject.set(x, "parentRelative", js.undefined)
  }
}
