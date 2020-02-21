package typings.graphqlTag

import typings.graphql.astMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-tag", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def disableExperimentalFragmentVariables(): Unit = js.native
  def disableFragmentWarnings(): Unit = js.native
  def enableExperimentalFragmentVariables(): Unit = js.native
  def resetCaches(): Unit = js.native
  @js.native
  object default extends js.Object {
    def apply(literals: String, placeholders: js.Any*): DocumentNode = js.native
    def apply(literals: js.Array[String], placeholders: js.Any*): DocumentNode = js.native
    def disableExperimentalFragmentVariables(): Unit = js.native
    def disableFragmentWarnings(): Unit = js.native
    def enableExperimentalFragmentVariables(): Unit = js.native
    def resetCaches(): Unit = js.native
  }
  
}

