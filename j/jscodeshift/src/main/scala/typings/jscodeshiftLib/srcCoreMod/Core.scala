package typings
package jscodeshiftLib.srcCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Core extends js.Object {
  var filters: Filters = js.native
  var mappings: Mappings = js.native
  @JSName("registerMethods")
  var registerMethods_Original: js.Function2[
    /* methods */ js.Object, 
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify recast.Type<any> */ /* type */ js.UndefOr[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify recast.Type<any> */ js.Any
    ], 
    scala.Unit
  ] = js.native
  /** template, bound to default parser */
  var template: jscodeshiftLib.srcTemplateMod.Template = js.native
  var types: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof recast.default.types */ js.Any = js.native
  def apply(source: java.lang.String): jscodeshiftLib.srcCollectionMod.Collection[_] = js.native
  def apply(source: java.lang.String, options: Options): jscodeshiftLib.srcCollectionMod.Collection[_] = js.native
  def apply(source: js.Array[ASTNode | ASTPath[ASTNode]]): jscodeshiftLib.srcCollectionMod.Collection[_] = js.native
  def apply(source: ASTNode): jscodeshiftLib.srcCollectionMod.Collection[_] = js.native
  def apply(source: ASTPath[ASTNode]): jscodeshiftLib.srcCollectionMod.Collection[_] = js.native
  def `match`(path: ASTNode, filter: js.Function1[/* path */ ASTNode, scala.Boolean]): scala.Boolean = js.native
  def `match`(path: ASTNode, filter: ASTNode): scala.Boolean = js.native
  def `match`(path: ASTPath[ASTNode], filter: js.Function1[/* path */ ASTNode, scala.Boolean]): scala.Boolean = js.native
  def `match`(path: ASTPath[ASTNode], filter: ASTNode): scala.Boolean = js.native
  def registerMethods(methods: js.Object): scala.Unit = js.native
  def registerMethods(
    methods: js.Object,
    `type`: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify recast.Type<any> */ js.Any
  ): scala.Unit = js.native
  /**
    * Utility function for registering plugins.
    *
    * Plugins are simple functions that are passed the core jscodeshift instance.
    * They should extend jscodeshift by calling `registerMethods`, etc.
    * This method guards against repeated registrations (the plugin callback will only be called once).
    */
  def use(plugin: Plugin): scala.Unit = js.native
  /**
    * Returns a version of the core jscodeshift function "bound" to a specific
    * parser.
    */
  def withParser(parser: java.lang.String): JSCodeshift = js.native
  def withParser(parser: Parser): JSCodeshift = js.native
}

