package typings.guardianProsemirrorInvisibles

import typings.prosemirrorState.mod.EditorState
import typings.prosemirrorState.mod.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@guardian/prosemirror-invisibles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Create a plugin to render invisible characters. Accepts a list of
    * creator functions, examples of which are defined in './invisibles'.
    *
    * Example usage: ```
    *  import hardBreak from 'invisibles/hard-break';
    *  import paragraph from 'invisibles/paragraph';
    *  const plugin = createInvisiblesPlugin([hardBreak(), paragraph()])
    * ```
    */
  inline def createInvisiblesPlugin(
    builders: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AddDecorationsForInvisible */ Any
    ]
  ): Plugin[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PluginState */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("createInvisiblesPlugin")(builders.asInstanceOf[js.Any]).asInstanceOf[Plugin[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PluginState */ Any
  ]]
  inline def createInvisiblesPlugin(
    builders: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AddDecorationsForInvisible */ Any
    ],
    isActive: Boolean
  ): Plugin[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PluginState */ Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("createInvisiblesPlugin")(builders.asInstanceOf[js.Any], isActive.asInstanceOf[js.Any])).asInstanceOf[Plugin[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PluginState */ Any
  ]]
  
  inline def selectActiveState(state: EditorState): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("selectActiveState")(state.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
