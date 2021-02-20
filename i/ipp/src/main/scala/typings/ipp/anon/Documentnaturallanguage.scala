package typings.ipp.anon

import typings.ipp.mod.CharacterSet
import typings.ipp.mod.MimeMediaType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Documentnaturallanguage extends StObject {
  
  var `attributes-charset`: js.UndefOr[CharacterSet] = js.native
  
  var `attributes-natural-language`: js.UndefOr[String] = js.native
  
  var compression: js.UndefOr[typings.ipp.mod.Compression] = js.native
  
  var `document-format`: js.UndefOr[MimeMediaType] = js.native
  
  var `document-name`: js.UndefOr[String] = js.native
  
  var `document-natural-language`: js.UndefOr[String] = js.native
  
  var `job-id`: js.UndefOr[Double] = js.native
  
  var `job-uri`: js.UndefOr[String] = js.native
  
  var `last-document`: Boolean = js.native
  
  var `printer-uri`: js.UndefOr[String] = js.native
  
  var `requesting-user-name`: String = js.native
}
object Documentnaturallanguage {
  
  @scala.inline
  def apply(`last-document`: Boolean, `requesting-user-name`: String): Documentnaturallanguage = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("last-document")(`last-document`.asInstanceOf[js.Any])
    __obj.updateDynamic("requesting-user-name")(`requesting-user-name`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Documentnaturallanguage]
  }
  
  @scala.inline
  implicit class DocumentnaturallanguageMutableBuilder[Self <: Documentnaturallanguage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def `setAttributes-charset`(value: CharacterSet): Self = StObject.set(x, "attributes-charset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAttributes-charsetUndefined`: Self = StObject.set(x, "attributes-charset", js.undefined)
    
    @scala.inline
    def `setAttributes-natural-language`(value: String): Self = StObject.set(x, "attributes-natural-language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAttributes-natural-languageUndefined`: Self = StObject.set(x, "attributes-natural-language", js.undefined)
    
    @scala.inline
    def setCompression(value: typings.ipp.mod.Compression): Self = StObject.set(x, "compression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompressionUndefined: Self = StObject.set(x, "compression", js.undefined)
    
    @scala.inline
    def `setDocument-format`(value: MimeMediaType): Self = StObject.set(x, "document-format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setDocument-formatUndefined`: Self = StObject.set(x, "document-format", js.undefined)
    
    @scala.inline
    def `setDocument-name`(value: String): Self = StObject.set(x, "document-name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setDocument-nameUndefined`: Self = StObject.set(x, "document-name", js.undefined)
    
    @scala.inline
    def `setDocument-natural-language`(value: String): Self = StObject.set(x, "document-natural-language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setDocument-natural-languageUndefined`: Self = StObject.set(x, "document-natural-language", js.undefined)
    
    @scala.inline
    def `setJob-id`(value: Double): Self = StObject.set(x, "job-id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setJob-idUndefined`: Self = StObject.set(x, "job-id", js.undefined)
    
    @scala.inline
    def `setJob-uri`(value: String): Self = StObject.set(x, "job-uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setJob-uriUndefined`: Self = StObject.set(x, "job-uri", js.undefined)
    
    @scala.inline
    def `setLast-document`(value: Boolean): Self = StObject.set(x, "last-document", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setPrinter-uri`(value: String): Self = StObject.set(x, "printer-uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setPrinter-uriUndefined`: Self = StObject.set(x, "printer-uri", js.undefined)
    
    @scala.inline
    def `setRequesting-user-name`(value: String): Self = StObject.set(x, "requesting-user-name", value.asInstanceOf[js.Any])
  }
}
