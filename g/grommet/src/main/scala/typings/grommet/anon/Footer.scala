package typings.grommet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Footer extends StObject {
  
  var body: js.UndefOr[AlignBackground] = js.undefined
  
  var footer: js.UndefOr[VerticalAlign] = js.undefined
  
  var header: js.UndefOr[Align] = js.undefined
  
  var row: js.UndefOr[`20`] = js.undefined
}
object Footer {
  
  @scala.inline
  def apply(): Footer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Footer]
  }
  
  @scala.inline
  implicit class FooterMutableBuilder[Self <: Footer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: AlignBackground): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    @scala.inline
    def setFooter(value: VerticalAlign): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
    
    @scala.inline
    def setHeader(value: Align): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    @scala.inline
    def setRow(value: `20`): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowUndefined: Self = StObject.set(x, "row", js.undefined)
  }
}
