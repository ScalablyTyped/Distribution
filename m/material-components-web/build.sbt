organization := "org.scalablytyped"
name := "material-components-web"
version := "0.43-dt-20190212Z-37c962"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "material__auto-init" % "0.35-dt-20190213Z-1431de",
  "org.scalablytyped" %%% "material__base" % "0.35-dt-20190313Z-48b229",
  "org.scalablytyped" %%% "material__checkbox" % "0.35-dt-20190313Z-fd6ef7",
  "org.scalablytyped" %%% "material__chips" % "0.35-dt-20190213Z-b9d198",
  "org.scalablytyped" %%% "material__dialog" % "0.35-dt-20190313Z-bb1a1c",
  "org.scalablytyped" %%% "material__drawer" % "0.43-dt-20190213Z-73f406",
  "org.scalablytyped" %%% "material__floating-label" % "0.35-dt-20190213Z-abf5f9",
  "org.scalablytyped" %%% "material__form-field" % "0.35-dt-20190313Z-d51e15",
  "org.scalablytyped" %%% "material__grid-list" % "0.35-dt-20190213Z-f640e6",
  "org.scalablytyped" %%% "material__icon-toggle" % "0.35-dt-20190313Z-bc5b23",
  "org.scalablytyped" %%% "material__line-ripple" % "0.35-dt-20190213Z-bfae8b",
  "org.scalablytyped" %%% "material__linear-progress" % "0.35-dt-20190213Z-f38819",
  "org.scalablytyped" %%% "material__list" % "0.43-dt-20190313Z-f10bb1",
  "org.scalablytyped" %%% "material__menu" % "0.35-dt-20190213Z-e91d74",
  "org.scalablytyped" %%% "material__notched-outline" % "0.35-dt-20190213Z-af6618",
  "org.scalablytyped" %%% "material__radio" % "0.35-dt-20190313Z-ec4b3e",
  "org.scalablytyped" %%% "material__ripple" % "0.35-dt-20190313Z-9cc5e6",
  "org.scalablytyped" %%% "material__select" % "0.35-dt-20190313Z-5c2c28",
  "org.scalablytyped" %%% "material__selection-control" % "0.35-dt-20190213Z-6c4d91",
  "org.scalablytyped" %%% "material__slider" % "0.35-dt-20190313Z-237fdc",
  "org.scalablytyped" %%% "material__snackbar" % "0.35-dt-20190313Z-883ae4",
  "org.scalablytyped" %%% "material__tabs" % "0.35-dt-20190313Z-2d1d64",
  "org.scalablytyped" %%% "material__textfield" % "0.35-dt-20190313Z-df4ab1",
  "org.scalablytyped" %%% "material__toolbar" % "0.35-dt-20190313Z-159aae",
  "org.scalablytyped" %%% "material__top-app-bar" % "0.35-dt-20190213Z-623a8c",
  "org.scalablytyped" %%% "std" % "3.5-f010ac")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        