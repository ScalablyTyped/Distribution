package typings.inquirer.mod

import typings.inquirer.anon.Default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides components for the ui.
  */
object ui {
  
  /**
    * Provides options for the bottom-bar UI.
    */
  trait BottomBarOptions
    extends StObject
       with StreamOptions {
    
    /**
      * The initial text to display.
      */
    var bottomBar: js.UndefOr[String] = js.undefined
  }
  object BottomBarOptions {
    
    inline def apply(): BottomBarOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BottomBarOptions]
    }
    
    extension [Self <: BottomBarOptions](x: Self) {
      
      inline def setBottomBar(value: String): Self = StObject.set(x, "bottomBar", value.asInstanceOf[js.Any])
      
      inline def setBottomBarUndefined: Self = StObject.set(x, "bottomBar", js.undefined)
    }
  }
  
  /**
    * Represents a fetched answer.
    */
  trait FetchedAnswer extends StObject {
    
    /**
      * The value of the answer.
      */
    var answer: js.Any
    
    /**
      * The name of the answer.
      */
    var name: String
  }
  object FetchedAnswer {
    
    inline def apply(answer: js.Any, name: String): FetchedAnswer = {
      val __obj = js.Dynamic.literal(answer = answer.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[FetchedAnswer]
    }
    
    extension [Self <: FetchedAnswer](x: Self) {
      
      inline def setAnswer(value: js.Any): Self = StObject.set(x, "answer", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Represents a fetched answer.
    *
    * @template T
    * The type of the answers.
    */
  type FetchedQuestion[T /* <: Answers */] = DistinctQuestion[T] & Default[T]
}
