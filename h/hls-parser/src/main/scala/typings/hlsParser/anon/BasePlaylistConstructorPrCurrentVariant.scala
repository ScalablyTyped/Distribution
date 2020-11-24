package typings.hlsParser.anon

import typings.hlsParser.mod.types.Key
import typings.hlsParser.mod.types.SessionData
import typings.hlsParser.mod.types.Variant
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined hls-parser.hls-parser.types.BasePlaylistConstructorProperties & {  variants :std.Array<hls-parser.hls-parser.types.Variant> | undefined,   currentVariant :number | undefined,   sessionDataList :std.Array<hls-parser.hls-parser.types.SessionData> | undefined,   sessionKeyList :std.Array<hls-parser.hls-parser.types.Key> | undefined,   source :string | undefined} */
@js.native
trait BasePlaylistConstructorPrCurrentVariant extends js.Object {
  
  var currentVariant: js.UndefOr[Double] = js.native
  
  var independentSegments: js.UndefOr[Boolean] = js.native
  
  var sessionDataList: js.UndefOr[js.Array[SessionData]] = js.native
  
  var sessionKeyList: js.UndefOr[js.Array[Key]] = js.native
  
  var source: js.UndefOr[String] = js.native
  
  var start: js.UndefOr[Offset] = js.native
  
  var uri: js.UndefOr[String] = js.native
  
  var variants: js.UndefOr[js.Array[Variant]] = js.native
  
  var version: js.UndefOr[Double] = js.native
}
object BasePlaylistConstructorPrCurrentVariant {
  
  @scala.inline
  def apply(): BasePlaylistConstructorPrCurrentVariant = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BasePlaylistConstructorPrCurrentVariant]
  }
  
  @scala.inline
  implicit class BasePlaylistConstructorPrCurrentVariantOps[Self <: BasePlaylistConstructorPrCurrentVariant] (val x: Self) extends AnyVal {
    
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
    def setCurrentVariant(value: Double): Self = this.set("currentVariant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrentVariant: Self = this.set("currentVariant", js.undefined)
    
    @scala.inline
    def setIndependentSegments(value: Boolean): Self = this.set("independentSegments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndependentSegments: Self = this.set("independentSegments", js.undefined)
    
    @scala.inline
    def setSessionDataListVarargs(value: SessionData*): Self = this.set("sessionDataList", js.Array(value :_*))
    
    @scala.inline
    def setSessionDataList(value: js.Array[SessionData]): Self = this.set("sessionDataList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSessionDataList: Self = this.set("sessionDataList", js.undefined)
    
    @scala.inline
    def setSessionKeyListVarargs(value: Key*): Self = this.set("sessionKeyList", js.Array(value :_*))
    
    @scala.inline
    def setSessionKeyList(value: js.Array[Key]): Self = this.set("sessionKeyList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSessionKeyList: Self = this.set("sessionKeyList", js.undefined)
    
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    
    @scala.inline
    def setStart(value: Offset): Self = this.set("start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
    
    @scala.inline
    def setUri(value: String): Self = this.set("uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUri: Self = this.set("uri", js.undefined)
    
    @scala.inline
    def setVariantsVarargs(value: Variant*): Self = this.set("variants", js.Array(value :_*))
    
    @scala.inline
    def setVariants(value: js.Array[Variant]): Self = this.set("variants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVariants: Self = this.set("variants", js.undefined)
    
    @scala.inline
    def setVersion(value: Double): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
}
