package typings.graphqlDashImport.graphqlDashImportMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-import", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def importSchema(schema: String): String = js.native
  def importSchema(schema: String, schemas: StringDictionary[String]): String = js.native
  def parseImportLine(importLine: String): RawModule = js.native
  def parseSDL(sdl: String): js.Array[RawModule] = js.native
}

