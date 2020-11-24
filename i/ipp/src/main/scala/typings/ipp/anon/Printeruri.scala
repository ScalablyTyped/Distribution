package typings.ipp.anon

import typings.ipp.mod.CharacterSet
import typings.ipp.mod.MimeMediaType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Printeruri extends js.Object {
  
  var `attributes-charset`: js.UndefOr[CharacterSet] = js.native
  
  var `attributes-natural-language`: js.UndefOr[String] = js.native
  
  var `document-format`: js.UndefOr[MimeMediaType] = js.native
  
  var `printer-uri`: js.UndefOr[String] = js.native
  
  var `requested-attributes`: js.UndefOr[
    js.Array[
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 385 */ js.Any
    ]
  ] = js.native
  
  var `requesting-user-name`: String = js.native
}
object Printeruri {
  
  @scala.inline
  def apply(`requesting-user-name`: String): Printeruri = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("requesting-user-name")(`requesting-user-name`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Printeruri]
  }
  
  @scala.inline
  implicit class PrinteruriOps[Self <: Printeruri] (val x: Self) extends AnyVal {
    
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
    def `setRequesting-user-name`(value: String): Self = this.set("requesting-user-name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAttributes-charset`(value: CharacterSet): Self = this.set("attributes-charset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAttributes-charset`: Self = this.set("attributes-charset", js.undefined)
    
    @scala.inline
    def `setAttributes-natural-language`(value: String): Self = this.set("attributes-natural-language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAttributes-natural-language`: Self = this.set("attributes-natural-language", js.undefined)
    
    @scala.inline
    def `setDocument-format`(value: MimeMediaType): Self = this.set("document-format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteDocument-format`: Self = this.set("document-format", js.undefined)
    
    @scala.inline
    def `setPrinter-uri`(value: String): Self = this.set("printer-uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deletePrinter-uri`: Self = this.set("printer-uri", js.undefined)
    
    @scala.inline
    def `setRequested-attributesVarargs`(
      value: (/* import warning: LimitUnionLength.leaveTypeRef Was union type with length 385 */ js.Any)*
    ): Self = this.set("requested-attributes", js.Array(value :_*))
    
    @scala.inline
    def `setRequested-attributes`(
      value: js.Array[
          /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 385 */ js.Any
        ]
    ): Self = this.set("requested-attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteRequested-attributes`: Self = this.set("requested-attributes", js.undefined)
  }
}
