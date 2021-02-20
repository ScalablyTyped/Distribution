package typings.inquirer

import typings.node.readlineMod.Interface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object screenManagerMod {
  
  /**
    * Provides the functionality to manage the content of a console-screen.
    */
  @JSImport("inquirer/lib/utils/screen-manager", JSImport.Namespace)
  @js.native
  class ^ protected () extends ScreenManager {
    /**
      * Initializes a new instance of the `ScreenManager` class.
      *
      * @param readLine
      * An object for performing read from and write to the console.
      */
    def this(readLine: Interface) = this()
  }
  
  /**
    * Provides the functionality to manage the content of a console-screen.
    */
  @js.native
  trait ScreenManager extends StObject {
    
    /**
      * Splits the `text` into multiple lines with the specified max `width`.
      *
      * @param text
      * The text to process.
      *
      * @param width
      * The max width of each line.
      */
    /* protected */ def breakLines(text: String, width: Double): js.Array[String] = js.native
    
    /**
      * Cleans all lines expect the first `extraLines`.
      *
      * @param extraLines
      * The number of lines at the begin to skip.
      */
    def clean(extraLines: Double): Unit = js.native
    
    /**
      * Releases all unmanaged resources.
      */
    def done(): Unit = js.native
    
    /**
      * Gets or sets the number of extra-lines below the prompt.
      */
    var extraLinesUnderPrompt: Double = js.native
    
    /**
      * Adds line-breaks to the specified `text` with the specified max `width`.
      *
      * @param text
      * The text to process.
      *
      * @param width
      * The max width of each line.
      */
    /* protected */ def forceLineReturn(text: String, width: Double): String = js.native
    
    /**
      * Gets or sets the height of the screen.
      */
    var height: Double = js.native
    
    /**
      * Identifies the width of the screen.
      *
      * @returns
      * The width of the screen.
      */
    /* protected */ def normalizedCliWidth(): Double = js.native
    
    /**
      * Releases the cursor.
      */
    def releaseCursor(): Unit = js.native
    
    /**
      * Renders content to the screen.
      *
      * @param content
      * The content to render.
      *
      * @param bottomContent
      * The content to render to the bottom of the screen.
      */
    def render(content: String, bottomContent: String): Unit = js.native
    
    /**
      * Gets or sets an object for performing read from and write to the console.
      */
    var rl: Interface = js.native
  }
  object ScreenManager {
    
    @scala.inline
    def apply(
      breakLines: (String, Double) => js.Array[String],
      clean: Double => Unit,
      done: () => Unit,
      extraLinesUnderPrompt: Double,
      forceLineReturn: (String, Double) => String,
      height: Double,
      normalizedCliWidth: () => Double,
      releaseCursor: () => Unit,
      render: (String, String) => Unit,
      rl: Interface
    ): ScreenManager = {
      val __obj = js.Dynamic.literal(breakLines = js.Any.fromFunction2(breakLines), clean = js.Any.fromFunction1(clean), done = js.Any.fromFunction0(done), extraLinesUnderPrompt = extraLinesUnderPrompt.asInstanceOf[js.Any], forceLineReturn = js.Any.fromFunction2(forceLineReturn), height = height.asInstanceOf[js.Any], normalizedCliWidth = js.Any.fromFunction0(normalizedCliWidth), releaseCursor = js.Any.fromFunction0(releaseCursor), render = js.Any.fromFunction2(render), rl = rl.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScreenManager]
    }
    
    @scala.inline
    implicit class ScreenManagerMutableBuilder[Self <: ScreenManager] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBreakLines(value: (String, Double) => js.Array[String]): Self = StObject.set(x, "breakLines", js.Any.fromFunction2(value))
      
      @scala.inline
      def setClean(value: Double => Unit): Self = StObject.set(x, "clean", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDone(value: () => Unit): Self = StObject.set(x, "done", js.Any.fromFunction0(value))
      
      @scala.inline
      def setExtraLinesUnderPrompt(value: Double): Self = StObject.set(x, "extraLinesUnderPrompt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceLineReturn(value: (String, Double) => String): Self = StObject.set(x, "forceLineReturn", js.Any.fromFunction2(value))
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNormalizedCliWidth(value: () => Double): Self = StObject.set(x, "normalizedCliWidth", js.Any.fromFunction0(value))
      
      @scala.inline
      def setReleaseCursor(value: () => Unit): Self = StObject.set(x, "releaseCursor", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRender(value: (String, String) => Unit): Self = StObject.set(x, "render", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRl(value: Interface): Self = StObject.set(x, "rl", value.asInstanceOf[js.Any])
    }
  }
}
