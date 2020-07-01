organization := "org.scalablytyped"
name := "homeworks"
version := "1.0.50-f87be5"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "angular__compiler" % "9.1.11-453a50",
  "org.scalablytyped" %%% "angular__core" % "9.1.11-deee9a",
  "org.scalablytyped" %%% "angular__forms" % "9.1.11-97eea0",
  "org.scalablytyped" %%% "inquirer" % "6.5-dt-20200226Z-17b669",
  "org.scalablytyped" %%% "jquery" % "3.5-dt-20200621Z-33c88a",
  "org.scalablytyped" %%% "node" % "14.0-dt-20200624Z-2fcd45",
  "org.scalablytyped" %%% "rxjs" % "6.5.5-51c44e",
  "org.scalablytyped" %%% "rxjs-compat" % "6.5.5-9cdce8",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20200515Z-775559",
  "org.scalablytyped" %%% "std" % "3.9-c9f1f8",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20200515Z-5818d2",
  "org.scalablytyped" %%% "typescript" % "3.9.5-0b3ab7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
