package typings.ltx.parserMod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StringDictionary
import typings.ltx.elementMod.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParserOptions extends js.Object {
  
  var Element: js.UndefOr[
    Instantiable2[
      /* name */ String, 
      /* attrs */ js.UndefOr[String | StringDictionary[js.Any]], 
      typings.ltx.elementMod.Element
    ]
  ] = js.native
  
  var Parser: js.UndefOr[
    Instantiable1[/* options */ js.UndefOr[ParserOptions], typings.ltx.parserMod.Parser]
  ] = js.native
}
object ParserOptions {
  
  @scala.inline
  def apply(): ParserOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParserOptions]
  }
  
  @scala.inline
  implicit class ParserOptionsOps[Self <: ParserOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setElement(
      value: Instantiable2[
          /* name */ String, 
          /* attrs */ js.UndefOr[String | StringDictionary[js.Any]], 
          Element
        ]
    ): Self = this.set("Element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElement: Self = this.set("Element", js.undefined)
    
    @scala.inline
    def setParser(value: Instantiable1[/* options */ js.UndefOr[ParserOptions], Parser]): Self = this.set("Parser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParser: Self = this.set("Parser", js.undefined)
  }
}
