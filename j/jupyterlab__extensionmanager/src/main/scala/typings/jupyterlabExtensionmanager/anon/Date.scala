package typings.jupyterlabExtensionmanager.anon

import org.scalablytyped.runtime.StringDictionary
import typings.jupyterlabExtensionmanager.npmMod.IPerson
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Date extends js.Object {
  
  /**
    * Timestamp of release(?).
    */
  var date: String = js.native
  
  /**
    * Description as listed in package.json.
    */
  var description: String = js.native
  
  /**
    * Package keywords.
    */
  var keywords: js.Array[String] = js.native
  
  /**
    * Various metadata links for the package.
    */
  var links: StringDictionary[String] = js.native
  
  /**
    * Maintainer list per package.json.
    */
  var maintainers: js.Array[IPerson] = js.native
  
  /**
    * The package name.
    */
  var name: String = js.native
  
  /**
    * Metadata about user who published the release.
    */
  var publisher: IPerson = js.native
  
  /**
    * The scope of the package (e.g. jupyterlab for @jupyterlab/services).
    */
  var scope: String = js.native
  
  /**
    * Version number.
    */
  var version: String = js.native
}
object Date {
  
  @scala.inline
  def apply(
    date: String,
    description: String,
    keywords: js.Array[String],
    links: StringDictionary[String],
    maintainers: js.Array[IPerson],
    name: String,
    publisher: IPerson,
    scope: String,
    version: String
  ): Date = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], keywords = keywords.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], maintainers = maintainers.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], publisher = publisher.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Date]
  }
  
  @scala.inline
  implicit class DateOps[Self <: Date] (val x: Self) extends AnyVal {
    
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
    def setDate(value: String): Self = this.set("date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeywordsVarargs(value: String*): Self = this.set("keywords", js.Array(value :_*))
    
    @scala.inline
    def setKeywords(value: js.Array[String]): Self = this.set("keywords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinks(value: StringDictionary[String]): Self = this.set("links", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaintainersVarargs(value: IPerson*): Self = this.set("maintainers", js.Array(value :_*))
    
    @scala.inline
    def setMaintainers(value: js.Array[IPerson]): Self = this.set("maintainers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublisher(value: IPerson): Self = this.set("publisher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScope(value: String): Self = this.set("scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
  }
}
