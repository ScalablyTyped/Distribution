package typings
package graphqlLib.typeDefinitionMod

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
  def inspect(): java.lang.String
  def toJSON(): java.lang.String
}

object GraphQLList {
  @scala.inline
  def apply[T /* <: GraphQLType */](
    inspect: () => java.lang.String,
    ofType: T,
    toJSON: () => java.lang.String,
    toString: () => java.lang.String
  ): GraphQLList[T] = {
    val __obj = js.Dynamic.literal(inspect = js.Any.fromFunction0(inspect), ofType = ofType.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toString = js.Any.fromFunction0(toString))
  
    __obj.asInstanceOf[GraphQLList[T]]
  }
}

