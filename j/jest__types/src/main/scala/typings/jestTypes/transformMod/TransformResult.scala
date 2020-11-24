package typings.jestTypes.transformMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransformResult extends js.Object {
  
  var code: String = js.native
  
  var mapCoverage: js.UndefOr[Boolean] = js.native
  
  var originalCode: String = js.native
  
  var sourceMapPath: String | Null = js.native
}
object TransformResult {
  
  @scala.inline
  def apply(code: String, originalCode: String): TransformResult = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], originalCode = originalCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformResult]
  }
  
  @scala.inline
  implicit class TransformResultOps[Self <: TransformResult] (val x: Self) extends AnyVal {
    
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
    def setCode(value: String): Self = this.set("code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalCode(value: String): Self = this.set("originalCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapCoverage(value: Boolean): Self = this.set("mapCoverage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMapCoverage: Self = this.set("mapCoverage", js.undefined)
    
    @scala.inline
    def setSourceMapPath(value: String): Self = this.set("sourceMapPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceMapPathNull: Self = this.set("sourceMapPath", null)
  }
}
