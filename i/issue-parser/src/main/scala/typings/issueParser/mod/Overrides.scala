package typings.issueParser.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Overrides extends Options {
  
  var actions: js.UndefOr[StringDictionary[js.Array[String]]] = js.native
  
  var delimiters: js.UndefOr[String | js.Array[String]] = js.native
  
  var hosts: js.UndefOr[String | js.Array[String]] = js.native
  
  var issuePrefixes: js.UndefOr[String | js.Array[String]] = js.native
  
  var issueURLSegments: js.UndefOr[String | js.Array[String]] = js.native
  
  var mentionsPrefixes: js.UndefOr[String | js.Array[String]] = js.native
  
  var overrides: js.UndefOr[String | js.Array[String]] = js.native
}
object Overrides {
  
  @scala.inline
  def apply(): Overrides = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Overrides]
  }
  
  @scala.inline
  implicit class OverridesOps[Self <: Overrides] (val x: Self) extends AnyVal {
    
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
    def setActions(value: StringDictionary[js.Array[String]]): Self = this.set("actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActions: Self = this.set("actions", js.undefined)
    
    @scala.inline
    def setDelimitersVarargs(value: String*): Self = this.set("delimiters", js.Array(value :_*))
    
    @scala.inline
    def setDelimiters(value: String | js.Array[String]): Self = this.set("delimiters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelimiters: Self = this.set("delimiters", js.undefined)
    
    @scala.inline
    def setHostsVarargs(value: String*): Self = this.set("hosts", js.Array(value :_*))
    
    @scala.inline
    def setHosts(value: String | js.Array[String]): Self = this.set("hosts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHosts: Self = this.set("hosts", js.undefined)
    
    @scala.inline
    def setIssuePrefixesVarargs(value: String*): Self = this.set("issuePrefixes", js.Array(value :_*))
    
    @scala.inline
    def setIssuePrefixes(value: String | js.Array[String]): Self = this.set("issuePrefixes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIssuePrefixes: Self = this.set("issuePrefixes", js.undefined)
    
    @scala.inline
    def setIssueURLSegmentsVarargs(value: String*): Self = this.set("issueURLSegments", js.Array(value :_*))
    
    @scala.inline
    def setIssueURLSegments(value: String | js.Array[String]): Self = this.set("issueURLSegments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIssueURLSegments: Self = this.set("issueURLSegments", js.undefined)
    
    @scala.inline
    def setMentionsPrefixesVarargs(value: String*): Self = this.set("mentionsPrefixes", js.Array(value :_*))
    
    @scala.inline
    def setMentionsPrefixes(value: String | js.Array[String]): Self = this.set("mentionsPrefixes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMentionsPrefixes: Self = this.set("mentionsPrefixes", js.undefined)
    
    @scala.inline
    def setOverridesVarargs(value: String*): Self = this.set("overrides", js.Array(value :_*))
    
    @scala.inline
    def setOverrides(value: String | js.Array[String]): Self = this.set("overrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverrides: Self = this.set("overrides", js.undefined)
  }
}
