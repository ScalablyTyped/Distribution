package typings
package atJupyterlabExtensionmanagerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Date extends js.Object {
  /**
    * Timestamp of release(?).
    */
  var date: java.lang.String
  /**
    * Description as listed in package.json.
    */
  var description: java.lang.String
  /**
    * Package keywords.
    */
  var keywords: js.Array[java.lang.String]
  /**
    * Various metadata links for the package.
    */
  var links: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  /**
    * Maintainer list per package.json.
    */
  var maintainers: js.Array[atJupyterlabExtensionmanagerLib.libQueryMod.IPerson]
  /**
    * The package name.
    */
  var name: java.lang.String
  /**
    * Metadata about user who published the release.
    */
  var publisher: atJupyterlabExtensionmanagerLib.libQueryMod.IPerson
  /**
    * The scope of the package (e.g. jupyterlab for @jupyterlab/services).
    */
  var scope: java.lang.String
  /**
    * Version number.
    */
  var version: java.lang.String
}

object Anon_Date {
  @scala.inline
  def apply(
    date: java.lang.String,
    description: java.lang.String,
    keywords: js.Array[java.lang.String],
    links: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    maintainers: js.Array[atJupyterlabExtensionmanagerLib.libQueryMod.IPerson],
    name: java.lang.String,
    publisher: atJupyterlabExtensionmanagerLib.libQueryMod.IPerson,
    scope: java.lang.String,
    version: java.lang.String
  ): Anon_Date = {
    val __obj = js.Dynamic.literal(date = date, description = description, keywords = keywords, links = links, maintainers = maintainers, name = name, publisher = publisher, scope = scope, version = version)
  
    __obj.asInstanceOf[Anon_Date]
  }
}

