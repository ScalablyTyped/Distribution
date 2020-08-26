package typings.graphqlToolsImport

import typings.graphql.astMod.DocumentNode
import typings.graphqlToolsImport.anon.From
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/import", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def parseImportLine(importLine: String): From = js.native
  def processImport(filePath: String): DocumentNode = js.native
  def processImport(filePath: String, cwd: js.UndefOr[scala.Nothing], predefinedImports: Record[String, String]): DocumentNode = js.native
  def processImport(filePath: String, cwd: String): DocumentNode = js.native
  def processImport(filePath: String, cwd: String, predefinedImports: Record[String, String]): DocumentNode = js.native
}

