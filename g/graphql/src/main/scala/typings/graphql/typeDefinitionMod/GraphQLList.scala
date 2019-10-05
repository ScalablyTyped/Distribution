package typings.graphql.typeDefinitionMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * List Modifier
  *
  * A list is a kind of type marker, a wrapping type which points to another
  * type. Lists are often created within the context of defining the fields
  * of an object type.
  *
  * Example:
  *
  *     const PersonType = new GraphQLObjectType({
  *       name: 'Person',
  *       fields: () => ({
  *         parents: { type: new GraphQLList(Person) },
  *         children: { type: new GraphQLList(Person) },
  *       })
  *     })
  *
  */
trait GraphQLList[T /* <: GraphQLType */] extends js.Object {
  val ofType: T
  def inspect(): String
  def toJSON(): String
}

@JSImport("graphql/type/definition", "GraphQLList")
@js.native
object GraphQLList extends TopLevel[_GraphQLList[GraphQLType]]

