package typings.jupyterlabExtensionmanager.anon

import org.scalablytyped.runtime.StringDictionary
import typings.jupyterlabExtensionmanager.npmMod.IPerson
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Date extends js.Object {
  /**
    * Timestamp of release(?).
    */
  var date: String
  /**
    * Description as listed in package.json.
    */
  var description: String
  /**
    * Package keywords.
    */
  var keywords: js.Array[String]
  /**
    * Various metadata links for the package.
    */
  var links: StringDictionary[String]
  /**
    * Maintainer list per package.json.
    */
  var maintainers: js.Array[IPerson]
  /**
    * The package name.
    */
  var name: String
  /**
    * Metadata about user who published the release.
    */
  var publisher: IPerson
  /**
    * The scope of the package (e.g. jupyterlab for @jupyterlab/services).
    */
  var scope: String
  /**
    * Version number.
    */
  var version: String
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
}

