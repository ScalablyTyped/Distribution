package typings.grommet

import typings.grommet.anon.Anchor
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object diagramMod {
  
  @JSImport("grommet/components/Diagram", "Diagram")
  @js.native
  val Diagram: FC[DiagramExtendedProps] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - scala.Boolean
    - typings.grommet.grommetStrings.pulse
    - typings.grommet.grommetStrings.draw
    - typings.grommet.anon.Size
  */
  type DiagramAnimationType = _DiagramAnimationType | Boolean
  
  /* Rewritten from type alias, can be one of: 
    - typings.grommet.grommetStrings.center
    - typings.grommet.grommetStrings.vertical
    - typings.grommet.grommetStrings.horizontal
  */
  trait DiagramConnectionAnchor extends StObject
  object DiagramConnectionAnchor {
    
    inline def center: typings.grommet.grommetStrings.center = "center".asInstanceOf[typings.grommet.grommetStrings.center]
    
    inline def horizontal: typings.grommet.grommetStrings.horizontal = "horizontal".asInstanceOf[typings.grommet.grommetStrings.horizontal]
    
    inline def vertical: typings.grommet.grommetStrings.vertical = "vertical".asInstanceOf[typings.grommet.grommetStrings.vertical]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.grommet.grommetStrings.direct
    - typings.grommet.grommetStrings.curved
    - typings.grommet.grommetStrings.rectilinear
  */
  trait DiagramConnectionType extends StObject
  object DiagramConnectionType {
    
    inline def curved: typings.grommet.grommetStrings.curved = "curved".asInstanceOf[typings.grommet.grommetStrings.curved]
    
    inline def direct: typings.grommet.grommetStrings.direct = "direct".asInstanceOf[typings.grommet.grommetStrings.direct]
    
    inline def rectilinear: typings.grommet.grommetStrings.rectilinear = "rectilinear".asInstanceOf[typings.grommet.grommetStrings.rectilinear]
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - scala.Any because Inheritance from two classes. Inlined getClass, hashCode, eq, equals, toString, ne, notify, notifyAll, wait, wait, wait, clone, finalize */ @js.native
  trait DiagramExtendedProps
    extends StObject
       with DiagramProps
  
  trait DiagramProps extends StObject {
    
    var animation: js.UndefOr[DiagramAnimationType] = js.undefined
    
    var connections: js.Array[Anchor]
  }
  object DiagramProps {
    
    inline def apply(connections: js.Array[Anchor]): DiagramProps = {
      val __obj = js.Dynamic.literal(connections = connections.asInstanceOf[js.Any])
      __obj.asInstanceOf[DiagramProps]
    }
    
    extension [Self <: DiagramProps](x: Self) {
      
      inline def setAnimation(value: DiagramAnimationType): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      inline def setConnections(value: js.Array[Anchor]): Self = StObject.set(x, "connections", value.asInstanceOf[js.Any])
      
      inline def setConnectionsVarargs(value: Anchor*): Self = StObject.set(x, "connections", js.Array(value*))
    }
  }
  
  trait _DiagramAnimationType extends StObject
  
  /* Inlined react.react.<global>.JSX.IntrinsicElements['svg'] */
  type divProps = scala.Nothing
}
