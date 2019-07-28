package typings.graphql.typeDefinitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Non-Null Modifier
  *
  * A non-null is a kind of type marker, a wrapping type which points to another
  * type. Non-null types enforce that their values are never null and can ensure
  * an error is raised if this ever occurs during a request. It is useful for
  * fields which you can make a strong guarantee on non-nullability, for example
  * usually the id field of a database row will never be null.
  *
  * Example:
  *
  *     const RowType = new GraphQLObjectType({
  *       name: 'Row',
  *       fields: () => ({
  *         id: { type: new GraphQLNonNull(GraphQLString) },
  *       })
  *     })
  *
  * Note: the enforcement of non-nullability occurs within the executor.
  */
trait GraphQLNonNull[T /* <: GraphQLNullableType */] extends js.Object {
  val ofType: T
  def inspect(): String
  def toJSON(): String
}

@JSImport("graphql/type/definition", "GraphQLNonNull")
@js.native
class GraphQLNonNullCls protected () extends GraphQLNonNull[GraphQLNullableType] {
  def this(`type`: GraphQLNullableType) = this()
  /* CompleteClass */
  override val ofType: GraphQLNullableType = js.native
  /* CompleteClass */
  override def inspect(): String = js.native
  /* CompleteClass */
  override def toJSON(): String = js.native
}

object GraphQLNonNull {
  @scala.inline
  def apply[T /* <: GraphQLNullableType */](inspect: () => String, ofType: T, toJSON: () => String, toString: () => String): GraphQLNonNull[T] = {
    val __obj = js.Dynamic.literal(inspect = js.Any.fromFunction0(inspect), ofType = ofType.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toString = js.Any.fromFunction0(toString))
  
    __obj.asInstanceOf[GraphQLNonNull[T]]
  }
}

