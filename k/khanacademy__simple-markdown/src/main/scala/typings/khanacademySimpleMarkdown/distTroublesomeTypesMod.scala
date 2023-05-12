package typings.khanacademySimpleMarkdown

import org.scalablytyped.runtime.StringDictionary
import typings.khanacademySimpleMarkdown.anon.Regex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTroublesomeTypesMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.khanacademySimpleMarkdown.anon.Arraystringindexnumber
    - typings.khanacademySimpleMarkdown.anon.Arraystringindexnumberund
  */
  trait Capture extends StObject
  
  type MatchFunction = Regex & (js.Function3[
    /* source */ String, 
    /* state */ State, 
    /* prevCapture */ String, 
    js.UndefOr[Capture | Null]
  ])
  
  trait State
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var `inline`: js.UndefOr[Boolean | Null] = js.undefined
    
    var key: js.UndefOr[String | Double] = js.undefined
  }
  object State {
    
    inline def apply(): State = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[State]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: State] (val x: Self) extends AnyVal {
      
      inline def setInline(value: Boolean): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
      
      inline def setInlineNull: Self = StObject.set(x, "inline", null)
      
      inline def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
      
      inline def setKey(value: String | Double): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    }
  }
}
