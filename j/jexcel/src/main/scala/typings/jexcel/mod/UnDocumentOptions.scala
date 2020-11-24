package typings.jexcel.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnDocumentOptions extends js.Object {
  
  var footers: js.UndefOr[
    js.Array[
      (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ title in string | number ]: jexcel.jexcel.CellValue}
    */ typings.jexcel.jexcelStrings.UnDocumentOptions with TopLevel[js.Any]) | js.Array[CellValue]
    ]
  ] = js.native
}
object UnDocumentOptions {
  
  @scala.inline
  def apply(): UnDocumentOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnDocumentOptions]
  }
  
  @scala.inline
  implicit class UnDocumentOptionsOps[Self <: UnDocumentOptions] (val x: Self) extends AnyVal {
    
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
    def setFootersVarargs(
      value: ((/* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ title in string | number ]: jexcel.jexcel.CellValue}
      */ typings.jexcel.jexcelStrings.UnDocumentOptions with TopLevel[js.Any]) | js.Array[CellValue])*
    ): Self = this.set("footers", js.Array(value :_*))
    
    @scala.inline
    def setFooters(
      value: js.Array[
          (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ title in string | number ]: jexcel.jexcel.CellValue}
      */ typings.jexcel.jexcelStrings.UnDocumentOptions with TopLevel[js.Any]) | js.Array[CellValue]
        ]
    ): Self = this.set("footers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFooters: Self = this.set("footers", js.undefined)
  }
}
