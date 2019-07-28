package typings.graphql.typeDefinitionMod

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
class GraphQLListCls protected () extends GraphQLList[GraphQLType] {
  def this(`type`: GraphQLType) = this()
  /* CompleteClass */
  override val ofType: GraphQLType = js.native
  /* CompleteClass */
  override def inspect(): String = js.native
  /* CompleteClass */
  override def toJSON(): String = js.native
}

object GraphQLList {
  @scala.inline
  def apply[T /* <: GraphQLType */](inspect: () => String, ofType: T, toJSON: () => String, toString: () => String): GraphQLList[T] = {
    val __obj = js.Dynamic.literal(inspect = js.Any.fromFunction0(inspect), ofType = ofType.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toString = js.Any.fromFunction0(toString))
  
    __obj.asInstanceOf[GraphQLList[T]]
  }
}

