package typings.graphqlResolvers

import org.scalablytyped.runtime.StringDictionary
import typings.graphqlTools.interfacesMod.IFieldResolver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-resolvers", JSImport.Namespace)
@js.native
object mod extends js.Object {
  val skip: js.UndefOr[scala.Nothing] = js.native
  def allResolvers[TSource, TContext, TArgs](resolvers: js.Array[IFieldResolver[TSource, TContext, TArgs]]): IFieldResolver[TSource, TContext, TArgs] = js.native
  def combineResolvers[TSource, TContext, TArgs](resolvers: (IFieldResolver[TSource, TContext, TArgs])*): IFieldResolver[TSource, TContext, TArgs] = js.native
  def isDependee[TSource, TContext, TArgs](resolver: IFieldResolver[TSource, TContext, TArgs]): IFieldResolver[TSource, TContext, TArgs] = js.native
  def pipeResolvers[TSource, TContext, TArgs](resolvers: (IFieldResolver[TSource, TContext, TArgs])*): IFieldResolver[TSource, TContext, TArgs] = js.native
  def resolveDependee(dependeeName: String): IFieldResolver[_, _, _] = js.native
  def resolveDependees(dependeeNames: js.Array[String]): IFieldResolver[_, _, _] = js.native
  type TArgsDefault = StringDictionary[js.Any]
}

