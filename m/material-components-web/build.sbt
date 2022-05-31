organization := "org.scalablytyped"
name := "material-components-web"
version := "8.0.0-6e5d99"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "material__auto-init" % "8.0.0-a1dd5d",
  "org.scalablytyped" %%% "material__banner" % "8.0.0-835d6d",
  "org.scalablytyped" %%% "material__base" % "8.0.0-9f15fe",
  "org.scalablytyped" %%% "material__checkbox" % "8.0.0-5a3161",
  "org.scalablytyped" %%% "material__chips" % "8.0.0-927e08",
  "org.scalablytyped" %%% "material__circular-progress" % "8.0.0-59f1df",
  "org.scalablytyped" %%% "material__data-table" % "8.0.0-199a0f",
  "org.scalablytyped" %%% "material__dialog" % "8.0.0-55dea4",
  "org.scalablytyped" %%% "material__dom" % "8.0.0-821e42",
  "org.scalablytyped" %%% "material__drawer" % "8.0.0-9bd5dd",
  "org.scalablytyped" %%% "material__floating-label" % "8.0.0-b3d038",
  "org.scalablytyped" %%% "material__form-field" % "8.0.0-bd94d1",
  "org.scalablytyped" %%% "material__icon-button" % "8.0.0-fe31f1",
  "org.scalablytyped" %%% "material__line-ripple" % "8.0.0-54f4e0",
  "org.scalablytyped" %%% "material__linear-progress" % "8.0.0-b7b5bf",
  "org.scalablytyped" %%% "material__list" % "8.0.0-f160ef",
  "org.scalablytyped" %%% "material__menu" % "8.0.0-9fb04b",
  "org.scalablytyped" %%% "material__menu-surface" % "8.0.0-292a27",
  "org.scalablytyped" %%% "material__notched-outline" % "8.0.0-ef1df7",
  "org.scalablytyped" %%% "material__progress-indicator" % "8.0.0-d99d22",
  "org.scalablytyped" %%% "material__radio" % "8.0.0-f0009e",
  "org.scalablytyped" %%% "material__ripple" % "8.0.0-256603",
  "org.scalablytyped" %%% "material__segmented-button" % "8.0.0-7c8a14",
  "org.scalablytyped" %%% "material__select" % "8.0.0-23f368",
  "org.scalablytyped" %%% "material__slider" % "8.0.0-193f92",
  "org.scalablytyped" %%% "material__snackbar" % "8.0.0-415e85",
  "org.scalablytyped" %%% "material__switch" % "8.0.0-9d3c8f",
  "org.scalablytyped" %%% "material__tab" % "8.0.0-1db750",
  "org.scalablytyped" %%% "material__tab-bar" % "8.0.0-e36704",
  "org.scalablytyped" %%% "material__tab-indicator" % "8.0.0-b842ba",
  "org.scalablytyped" %%% "material__tab-scroller" % "8.0.0-f348ba",
  "org.scalablytyped" %%% "material__textfield" % "8.0.0-4f2931",
  "org.scalablytyped" %%% "material__tooltip" % "8.0.0-e279de",
  "org.scalablytyped" %%% "material__top-app-bar" % "8.0.0-2b85ca",
  "org.scalablytyped" %%% "std" % "4.1-f7e8ab")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
