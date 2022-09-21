package typings.grommet.anon

import typings.grommet.paragraphMod.ParagraphProps
import typings.grommet.utilsMod.PadType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Subtitle extends StObject {
  
  var pad: js.UndefOr[PadType] = js.undefined
  
  var subtitle: js.UndefOr[ParagraphProps] = js.undefined
  
  var title: js.UndefOr[ParagraphProps] = js.undefined
}
object Subtitle {
  
  inline def apply(): Subtitle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Subtitle]
  }
  
  extension [Self <: Subtitle](x: Self) {
    
    inline def setPad(value: PadType): Self = StObject.set(x, "pad", value.asInstanceOf[js.Any])
    
    inline def setPadUndefined: Self = StObject.set(x, "pad", js.undefined)
    
    inline def setSubtitle(value: ParagraphProps): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
    
    inline def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
    
    inline def setTitle(value: ParagraphProps): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
