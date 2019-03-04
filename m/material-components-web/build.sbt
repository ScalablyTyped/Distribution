organization := "org.scalablytyped"
name := "material-components-web"
version := "0.43-dt-20190212Z-a84baa"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "material__auto-init" % "0.35-dt-20190213Z-da63c4",
  "org.scalablytyped" %%% "material__base" % "0.35-dt-20190213Z-e1c035",
  "org.scalablytyped" %%% "material__checkbox" % "0.35-dt-20190213Z-963b5a",
  "org.scalablytyped" %%% "material__chips" % "0.35-dt-20190213Z-14c7e2",
  "org.scalablytyped" %%% "material__dialog" % "0.35-dt-20190213Z-e8b940",
  "org.scalablytyped" %%% "material__dom" % "0.43-dt-20190213Z-0c100e",
  "org.scalablytyped" %%% "material__drawer" % "0.43-dt-20190213Z-764aa3",
  "org.scalablytyped" %%% "material__floating-label" % "0.35-dt-20190213Z-a534cb",
  "org.scalablytyped" %%% "material__form-field" % "0.35-dt-20190213Z-ce8905",
  "org.scalablytyped" %%% "material__grid-list" % "0.35-dt-20190213Z-0ba63d",
  "org.scalablytyped" %%% "material__icon-toggle" % "0.35-dt-20190213Z-ab62fc",
  "org.scalablytyped" %%% "material__line-ripple" % "0.35-dt-20190213Z-00c763",
  "org.scalablytyped" %%% "material__linear-progress" % "0.35-dt-20190213Z-22db68",
  "org.scalablytyped" %%% "material__list" % "0.43-dt-20190213Z-fab429",
  "org.scalablytyped" %%% "material__menu" % "0.35-dt-20190213Z-3f06f3",
  "org.scalablytyped" %%% "material__notched-outline" % "0.35-dt-20190213Z-e7ff21",
  "org.scalablytyped" %%% "material__radio" % "0.35-dt-20190213Z-7179c3",
  "org.scalablytyped" %%% "material__ripple" % "0.35-dt-20190213Z-5f1dee",
  "org.scalablytyped" %%% "material__select" % "0.35-dt-20190213Z-d44484",
  "org.scalablytyped" %%% "material__selection-control" % "0.35-dt-20190213Z-bc67a1",
  "org.scalablytyped" %%% "material__slider" % "0.35-dt-20190213Z-1db13e",
  "org.scalablytyped" %%% "material__snackbar" % "0.35-dt-20190213Z-017bf4",
  "org.scalablytyped" %%% "material__tabs" % "0.35-dt-20190213Z-2e02b5",
  "org.scalablytyped" %%% "material__textfield" % "0.35-dt-20190213Z-8be697",
  "org.scalablytyped" %%% "material__toolbar" % "0.35-dt-20190213Z-63fb03",
  "org.scalablytyped" %%% "material__top-app-bar" % "0.35-dt-20190213Z-b0e6c8",
  "org.scalablytyped" %%% "std" % "3.3-05be79")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        