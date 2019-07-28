package typings.graphqlDashResolvers.graphqlDashResolversMod

import typings.graphqlDashTools.distInterfacesMod.IFieldResolver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-resolvers", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val skip: js.UndefOr[scala.Nothing] = js.native
  def allResolvers[TSource, TContext](resolvers: js.Array[IFieldResolver[TSource, TContext, TArgs]]): IFieldResolver[TSource, TContext, TArgs] = js.native
  def combineResolvers[TSource, TContext](resolvers: (IFieldResolver[TSource, TContext, TArgs])*): IFieldResolver[TSource, TContext, TArgs] = js.native
  def isDependee[TSource, TContext](resolver: IFieldResolver[TSource, TContext, TArgs]): IFieldResolver[TSource, TContext, TArgs] = js.native
  def pipeResolvers[TSource, TContext](resolvers: (IFieldResolver[TSource, TContext, TArgs])*): IFieldResolver[TSource, TContext, TArgs] = js.native
  def resolveDependee(dependeeName: String): IFieldResolver[_, _, TArgs] = js.native
  def resolveDependees(dependeeNames: js.Array[String]): IFieldResolver[_, _, TArgs] = js.native
}

