organization := "org.scalablytyped"
name := "material-components-web"
version := "14.0.0-b6c2e3"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "material__auto-init" % "14.0.0-b97208",
  "org.scalablytyped" %%% "material__banner" % "14.0.0-55b09b",
  "org.scalablytyped" %%% "material__base" % "14.0.0-fb3775",
  "org.scalablytyped" %%% "material__checkbox" % "14.0.0-6935c1",
  "org.scalablytyped" %%% "material__chips" % "14.0.0-655e96",
  "org.scalablytyped" %%% "material__circular-progress" % "14.0.0-5838f7",
  "org.scalablytyped" %%% "material__data-table" % "14.0.0-bff0b7",
  "org.scalablytyped" %%% "material__dialog" % "14.0.0-1b4227",
  "org.scalablytyped" %%% "material__dom" % "14.0.0-7fe567",
  "org.scalablytyped" %%% "material__drawer" % "14.0.0-f93027",
  "org.scalablytyped" %%% "material__floating-label" % "14.0.0-36cc04",
  "org.scalablytyped" %%% "material__form-field" % "14.0.0-c4f588",
  "org.scalablytyped" %%% "material__icon-button" % "14.0.0-c7daeb",
  "org.scalablytyped" %%% "material__line-ripple" % "14.0.0-89070f",
  "org.scalablytyped" %%% "material__linear-progress" % "14.0.0-541404",
  "org.scalablytyped" %%% "material__list" % "14.0.0-2b9878",
  "org.scalablytyped" %%% "material__menu" % "14.0.0-259d3a",
  "org.scalablytyped" %%% "material__menu-surface" % "14.0.0-034af3",
  "org.scalablytyped" %%% "material__notched-outline" % "14.0.0-0b0587",
  "org.scalablytyped" %%% "material__progress-indicator" % "14.0.0-5ca3a3",
  "org.scalablytyped" %%% "material__radio" % "14.0.0-dfc683",
  "org.scalablytyped" %%% "material__ripple" % "14.0.0-3421ae",
  "org.scalablytyped" %%% "material__segmented-button" % "14.0.0-6c54fd",
  "org.scalablytyped" %%% "material__select" % "14.0.0-205a5f",
  "org.scalablytyped" %%% "material__slider" % "14.0.0-34e6db",
  "org.scalablytyped" %%% "material__snackbar" % "14.0.0-9b757d",
  "org.scalablytyped" %%% "material__switch" % "14.0.0-32def9",
  "org.scalablytyped" %%% "material__tab" % "14.0.0-455386",
  "org.scalablytyped" %%% "material__tab-bar" % "14.0.0-a35ca9",
  "org.scalablytyped" %%% "material__tab-indicator" % "14.0.0-b7dc95",
  "org.scalablytyped" %%% "material__tab-scroller" % "14.0.0-4271dc",
  "org.scalablytyped" %%% "material__textfield" % "14.0.0-bb27cd",
  "org.scalablytyped" %%% "material__tooltip" % "14.0.0-a71ac8",
  "org.scalablytyped" %%% "material__top-app-bar" % "14.0.0-becc14",
  "org.scalablytyped" %%% "std" % "4.8-686d1d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
