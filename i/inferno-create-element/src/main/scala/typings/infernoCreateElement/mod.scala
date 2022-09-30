package typings.infernoCreateElement

import typings.inferno.typesMod.Inferno.ComponentClass
import typings.inferno.typesMod.Inferno.StatelessComponent
import typings.inferno.typesMod.Props
import typings.inferno.typesMod.VNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("inferno-create-element", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createElement[P](`type`: String, props: P & Props[P], _children: Any*): VNode = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(_children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[VNode]
  inline def createElement[P](`type`: String, props: Null, _children: Any*): VNode = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(_children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[VNode]
  inline def createElement[P](`type`: String, props: Unit, _children: Any*): VNode = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(_children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[VNode]
  inline def createElement[P](`type`: ComponentClass[P], props: P & Props[P], _children: Any*): VNode = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(_children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[VNode]
  inline def createElement[P](`type`: ComponentClass[P], props: Null, _children: Any*): VNode = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(_children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[VNode]
  inline def createElement[P](`type`: ComponentClass[P], props: Unit, _children: Any*): VNode = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(_children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[VNode]
  inline def createElement[P](`type`: StatelessComponent[P], props: P & Props[P], _children: Any*): VNode = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(_children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[VNode]
  inline def createElement[P](`type`: StatelessComponent[P], props: Null, _children: Any*): VNode = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(_children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[VNode]
  inline def createElement[P](`type`: StatelessComponent[P], props: Unit, _children: Any*): VNode = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(_children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[VNode]
}
