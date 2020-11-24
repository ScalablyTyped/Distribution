package typings.greasemonkey.GM

import org.scalablytyped.runtime.StringDictionary
import typings.greasemonkey.anon.Mimetype
import typings.greasemonkey.greasemonkeyStrings.end
import typings.greasemonkey.greasemonkeyStrings.idle
import typings.greasemonkey.greasemonkeyStrings.start
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScriptInfo extends js.Object {
  
  var description: String = js.native
  
  var excludes: js.Array[String] = js.native
  
  var includes: js.Array[String] = js.native
  
  var matches: js.Array[String] = js.native
  
  var name: String = js.native
  
  var namespace: js.UndefOr[String] = js.native
  
  /**
    * An object keyed by resource name.
    * Each value is an object with keys `name` and `mimetype` and `url`
    * with string values.
    */
  var resources: StringDictionary[Mimetype] = js.native
  
  /** @default 'end' */
  var runAt: start | end | idle = js.native
  
  var uuid: String = js.native
  
  var version: String = js.native
}
object ScriptInfo {
  
  @scala.inline
  def apply(
    description: String,
    excludes: js.Array[String],
    includes: js.Array[String],
    matches: js.Array[String],
    name: String,
    resources: StringDictionary[Mimetype],
    runAt: start | end | idle,
    uuid: String,
    version: String
  ): ScriptInfo = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], excludes = excludes.asInstanceOf[js.Any], includes = includes.asInstanceOf[js.Any], matches = matches.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any], runAt = runAt.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScriptInfo]
  }
  
  @scala.inline
  implicit class ScriptInfoOps[Self <: ScriptInfo] (val x: Self) extends AnyVal {
    
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludesVarargs(value: String*): Self = this.set("excludes", js.Array(value :_*))
    
    @scala.inline
    def setExcludes(value: js.Array[String]): Self = this.set("excludes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludesVarargs(value: String*): Self = this.set("includes", js.Array(value :_*))
    
    @scala.inline
    def setIncludes(value: js.Array[String]): Self = this.set("includes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchesVarargs(value: String*): Self = this.set("matches", js.Array(value :_*))
    
    @scala.inline
    def setMatches(value: js.Array[String]): Self = this.set("matches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResources(value: StringDictionary[Mimetype]): Self = this.set("resources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunAt(value: start | end | idle): Self = this.set("runAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUuid(value: String): Self = this.set("uuid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespace(value: String): Self = this.set("namespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNamespace: Self = this.set("namespace", js.undefined)
  }
}
