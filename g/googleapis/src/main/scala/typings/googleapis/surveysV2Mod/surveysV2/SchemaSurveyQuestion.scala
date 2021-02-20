package typings.googleapis.surveysV2Mod.surveysV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Message defining the question specifications.
  */
@js.native
trait SchemaSurveyQuestion extends StObject {
  
  /**
    * The randomization option for multiple choice and multi-select questions.
    * If not specified, this option defaults to randomize.
    */
  var answerOrder: js.UndefOr[String] = js.native
  
  /**
    * Required list of answer options for a question.
    */
  var answers: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Option to allow open-ended text box for Single Answer and Multiple Answer
    * question types. This can be used with SINGLE_ANSWER,
    * SINGLE_ANSWER_WITH_IMAGE, MULTIPLE_ANSWERS, and
    * MULTIPLE_ANSWERS_WITH_IMAGE question types.
    */
  var hasOther: js.UndefOr[Boolean] = js.native
  
  /**
    * For rating questions, the text for the higher end of the scale, such as
    * &#39;Best&#39;. For numeric questions, a string representing a
    * floating-point that is the maximum allowed number for a response.
    */
  var highValueLabel: js.UndefOr[String] = js.native
  
  var images: js.UndefOr[js.Array[SchemaSurveyQuestionImage]] = js.native
  
  /**
    * Currently only support pinning an answer option to the last position.
    */
  var lastAnswerPositionPinned: js.UndefOr[Boolean] = js.native
  
  /**
    * For rating questions, the text for the lower end of the scale, such as
    * &#39;Worst&#39;. For numeric questions, a string representing a
    * floating-point that is the minimum allowed number for a response.
    */
  var lowValueLabel: js.UndefOr[String] = js.native
  
  /**
    * Option to force the user to pick one of the open text suggestions. This
    * requires that suggestions are provided for this question.
    */
  var mustPickSuggestion: js.UndefOr[Boolean] = js.native
  
  /**
    * Number of stars to use for ratings questions.
    */
  var numStars: js.UndefOr[String] = js.native
  
  /**
    * Placeholder text for an open text question.
    */
  var openTextPlaceholder: js.UndefOr[String] = js.native
  
  /**
    * A list of suggested answers for open text question auto-complete. This is
    * only valid if single_line_response is true.
    */
  var openTextSuggestions: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Required question text shown to the respondent.
    */
  var question: js.UndefOr[String] = js.native
  
  /**
    * Used by the Rating Scale with Text question type. This text goes along
    * with the question field that is presented to the respondent, and is the
    * actual text that the respondent is asked to rate.
    */
  var sentimentText: js.UndefOr[String] = js.native
  
  /**
    * Option to allow multiple line open text responses instead of a single
    * line response. Note that we don&#39;t show auto-complete suggestions with
    * multiple line responses.
    */
  var singleLineResponse: js.UndefOr[Boolean] = js.native
  
  /**
    * The threshold/screener answer options, which will screen a user into the
    * rest of the survey. These will be a subset of the answer option strings.
    */
  var thresholdAnswers: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Required field defining the question type. For details about configuring
    * different type of questions, consult the question configuration guide.
    */
  var `type`: js.UndefOr[String] = js.native
  
  /**
    * Optional unit of measurement for display (for example: hours, people,
    * miles).
    */
  var unitOfMeasurementLabel: js.UndefOr[String] = js.native
  
  /**
    * The YouTube video ID to be show in video questions.
    */
  var videoId: js.UndefOr[String] = js.native
}
object SchemaSurveyQuestion {
  
  @scala.inline
  def apply(): SchemaSurveyQuestion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSurveyQuestion]
  }
  
  @scala.inline
  implicit class SchemaSurveyQuestionMutableBuilder[Self <: SchemaSurveyQuestion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnswerOrder(value: String): Self = StObject.set(x, "answerOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnswerOrderUndefined: Self = StObject.set(x, "answerOrder", js.undefined)
    
    @scala.inline
    def setAnswers(value: js.Array[String]): Self = StObject.set(x, "answers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnswersUndefined: Self = StObject.set(x, "answers", js.undefined)
    
    @scala.inline
    def setAnswersVarargs(value: String*): Self = StObject.set(x, "answers", js.Array(value :_*))
    
    @scala.inline
    def setHasOther(value: Boolean): Self = StObject.set(x, "hasOther", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasOtherUndefined: Self = StObject.set(x, "hasOther", js.undefined)
    
    @scala.inline
    def setHighValueLabel(value: String): Self = StObject.set(x, "highValueLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighValueLabelUndefined: Self = StObject.set(x, "highValueLabel", js.undefined)
    
    @scala.inline
    def setImages(value: js.Array[SchemaSurveyQuestionImage]): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImagesUndefined: Self = StObject.set(x, "images", js.undefined)
    
    @scala.inline
    def setImagesVarargs(value: SchemaSurveyQuestionImage*): Self = StObject.set(x, "images", js.Array(value :_*))
    
    @scala.inline
    def setLastAnswerPositionPinned(value: Boolean): Self = StObject.set(x, "lastAnswerPositionPinned", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastAnswerPositionPinnedUndefined: Self = StObject.set(x, "lastAnswerPositionPinned", js.undefined)
    
    @scala.inline
    def setLowValueLabel(value: String): Self = StObject.set(x, "lowValueLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLowValueLabelUndefined: Self = StObject.set(x, "lowValueLabel", js.undefined)
    
    @scala.inline
    def setMustPickSuggestion(value: Boolean): Self = StObject.set(x, "mustPickSuggestion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMustPickSuggestionUndefined: Self = StObject.set(x, "mustPickSuggestion", js.undefined)
    
    @scala.inline
    def setNumStars(value: String): Self = StObject.set(x, "numStars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumStarsUndefined: Self = StObject.set(x, "numStars", js.undefined)
    
    @scala.inline
    def setOpenTextPlaceholder(value: String): Self = StObject.set(x, "openTextPlaceholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenTextPlaceholderUndefined: Self = StObject.set(x, "openTextPlaceholder", js.undefined)
    
    @scala.inline
    def setOpenTextSuggestions(value: js.Array[String]): Self = StObject.set(x, "openTextSuggestions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenTextSuggestionsUndefined: Self = StObject.set(x, "openTextSuggestions", js.undefined)
    
    @scala.inline
    def setOpenTextSuggestionsVarargs(value: String*): Self = StObject.set(x, "openTextSuggestions", js.Array(value :_*))
    
    @scala.inline
    def setQuestion(value: String): Self = StObject.set(x, "question", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuestionUndefined: Self = StObject.set(x, "question", js.undefined)
    
    @scala.inline
    def setSentimentText(value: String): Self = StObject.set(x, "sentimentText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSentimentTextUndefined: Self = StObject.set(x, "sentimentText", js.undefined)
    
    @scala.inline
    def setSingleLineResponse(value: Boolean): Self = StObject.set(x, "singleLineResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingleLineResponseUndefined: Self = StObject.set(x, "singleLineResponse", js.undefined)
    
    @scala.inline
    def setThresholdAnswers(value: js.Array[String]): Self = StObject.set(x, "thresholdAnswers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThresholdAnswersUndefined: Self = StObject.set(x, "thresholdAnswers", js.undefined)
    
    @scala.inline
    def setThresholdAnswersVarargs(value: String*): Self = StObject.set(x, "thresholdAnswers", js.Array(value :_*))
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setUnitOfMeasurementLabel(value: String): Self = StObject.set(x, "unitOfMeasurementLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnitOfMeasurementLabelUndefined: Self = StObject.set(x, "unitOfMeasurementLabel", js.undefined)
    
    @scala.inline
    def setVideoId(value: String): Self = StObject.set(x, "videoId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoIdUndefined: Self = StObject.set(x, "videoId", js.undefined)
  }
}
