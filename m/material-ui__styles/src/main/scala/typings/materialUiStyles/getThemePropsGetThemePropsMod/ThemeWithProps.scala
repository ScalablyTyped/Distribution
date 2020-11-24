package typings.materialUiStyles.getThemePropsGetThemePropsMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ThemeWithProps[Components] extends js.Object {
  
  var props: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Components ]: std.Partial<Components[K]>}
    */ typings.materialUiStyles.materialUiStylesStrings.ThemeWithProps with TopLevel[Components]
  ] = js.native
}
object ThemeWithProps {
  
  @scala.inline
  def apply[Components](): ThemeWithProps[Components] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThemeWithProps[Components]]
  }
  
  @scala.inline
  implicit class ThemeWithPropsOps[Self <: ThemeWithProps[_], Components] (val x: Self with ThemeWithProps[Components]) extends AnyVal {
    
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
    def setProps(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof Components ]: std.Partial<Components[K]>}
      */ typings.materialUiStyles.materialUiStylesStrings.ThemeWithProps with TopLevel[Components]
    ): Self = this.set("props", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProps: Self = this.set("props", js.undefined)
  }
}
