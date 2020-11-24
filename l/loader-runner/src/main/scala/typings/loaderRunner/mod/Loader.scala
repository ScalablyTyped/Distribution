package typings.loaderRunner.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Loader extends js.Object {
  
  var data: js.Any = js.native
  
  var normal: Null | (js.Function1[/* request */ String, String]) = js.native
  
  var normalExecuted: Boolean = js.native
  
  var options: js.Any = js.native
  
  var path: String = js.native
  
  var pitch: Null | (js.Function1[/* request */ String, String]) = js.native
  
  var pitchExecuted: Boolean = js.native
  
  var query: String = js.native
  
  var raw: String = js.native
  
  var request: String = js.native
}
object Loader {
  
  @scala.inline
  def apply(
    data: js.Any,
    normalExecuted: Boolean,
    options: js.Any,
    path: String,
    pitchExecuted: Boolean,
    query: String,
    raw: String,
    request: String
  ): Loader = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], normalExecuted = normalExecuted.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], pitchExecuted = pitchExecuted.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[Loader]
  }
  
  @scala.inline
  implicit class LoaderOps[Self <: Loader] (val x: Self) extends AnyVal {
    
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
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNormalExecuted(value: Boolean): Self = this.set("normalExecuted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: js.Any): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPitchExecuted(value: Boolean): Self = this.set("pitchExecuted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuery(value: String): Self = this.set("query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRaw(value: String): Self = this.set("raw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: String): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNormal(value: /* request */ String => String): Self = this.set("normal", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNormalNull: Self = this.set("normal", null)
    
    @scala.inline
    def setPitch(value: /* request */ String => String): Self = this.set("pitch", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPitchNull: Self = this.set("pitch", null)
  }
}
